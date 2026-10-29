.class public final Lio/sentry/x6;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lio/sentry/m1;


# instance fields
.field public final a:Lio/sentry/protocol/w;

.field public final b:Lio/sentry/a7;

.field public final c:Ljava/util/concurrent/CopyOnWriteArrayList;

.field public final d:Lio/sentry/g4;

.field public final e:Ljava/lang/String;

.field public f:Lio/sentry/w6;

.field public volatile g:Lio/sentry/v6;

.field public volatile h:Lio/sentry/v6;

.field public volatile i:Ljava/util/Timer;

.field public final j:Lio/sentry/util/a;

.field public final k:Lio/sentry/util/a;

.field public final l:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final m:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final n:Lio/sentry/protocol/i0;

.field public final o:Lio/sentry/r1;

.field public final p:Lio/sentry/protocol/e;

.field public final q:Lio/sentry/m;

.field public final r:Lio/sentry/k7;


# direct methods
.method public constructor <init>(Lio/sentry/j7;Lio/sentry/g4;Lio/sentry/k7;Lio/sentry/m;)V
    .locals 7

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lio/sentry/protocol/w;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lio/sentry/x6;->a:Lio/sentry/protocol/w;

    .line 10
    .line 11
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lio/sentry/x6;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 17
    .line 18
    sget-object v0, Lio/sentry/w6;->c:Lio/sentry/w6;

    .line 19
    .line 20
    iput-object v0, p0, Lio/sentry/x6;->f:Lio/sentry/w6;

    .line 21
    .line 22
    const/4 v0, 0x0

    .line 23
    iput-object v0, p0, Lio/sentry/x6;->i:Ljava/util/Timer;

    .line 24
    .line 25
    new-instance v1, Lio/sentry/util/a;

    .line 26
    .line 27
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 28
    .line 29
    .line 30
    iput-object v1, p0, Lio/sentry/x6;->j:Lio/sentry/util/a;

    .line 31
    .line 32
    new-instance v2, Lio/sentry/util/a;

    .line 33
    .line 34
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 35
    .line 36
    .line 37
    iput-object v2, p0, Lio/sentry/x6;->k:Lio/sentry/util/a;

    .line 38
    .line 39
    new-instance v2, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 40
    .line 41
    const/4 v3, 0x0

    .line 42
    invoke-direct {v2, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 43
    .line 44
    .line 45
    iput-object v2, p0, Lio/sentry/x6;->l:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 46
    .line 47
    new-instance v2, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 48
    .line 49
    invoke-direct {v2, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 50
    .line 51
    .line 52
    iput-object v2, p0, Lio/sentry/x6;->m:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 53
    .line 54
    new-instance v4, Lio/sentry/protocol/e;

    .line 55
    .line 56
    invoke-direct {v4}, Lio/sentry/protocol/e;-><init>()V

    .line 57
    .line 58
    .line 59
    iput-object v4, p0, Lio/sentry/x6;->p:Lio/sentry/protocol/e;

    .line 60
    .line 61
    new-instance v5, Lio/sentry/a7;

    .line 62
    .line 63
    invoke-direct {v5, p1, p0, p2, p3}, Lio/sentry/a7;-><init>(Lio/sentry/j7;Lio/sentry/x6;Lio/sentry/g4;Lio/sentry/k7;)V

    .line 64
    .line 65
    .line 66
    iput-object v5, p0, Lio/sentry/x6;->b:Lio/sentry/a7;

    .line 67
    .line 68
    iget-object v6, p1, Lio/sentry/j7;->a0:Ljava/lang/String;

    .line 69
    .line 70
    iput-object v6, p0, Lio/sentry/x6;->e:Ljava/lang/String;

    .line 71
    .line 72
    iget-object v6, p1, Lio/sentry/b7;->W:Lio/sentry/r1;

    .line 73
    .line 74
    iput-object v6, p0, Lio/sentry/x6;->o:Lio/sentry/r1;

    .line 75
    .line 76
    iput-object p2, p0, Lio/sentry/x6;->d:Lio/sentry/g4;

    .line 77
    .line 78
    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 79
    .line 80
    invoke-virtual {p0}, Lio/sentry/x6;->C()Ljava/lang/Boolean;

    .line 81
    .line 82
    .line 83
    move-result-object v6

    .line 84
    invoke-virtual {p2, v6}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    move-result v6

    .line 88
    if-eqz v6, :cond_0

    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_0
    move-object p4, v0

    .line 92
    :goto_0
    iput-object p4, p0, Lio/sentry/x6;->q:Lio/sentry/m;

    .line 93
    .line 94
    iget-object p1, p1, Lio/sentry/j7;->b0:Lio/sentry/protocol/i0;

    .line 95
    .line 96
    iput-object p1, p0, Lio/sentry/x6;->n:Lio/sentry/protocol/i0;

    .line 97
    .line 98
    iput-object p3, p0, Lio/sentry/x6;->r:Lio/sentry/k7;

    .line 99
    .line 100
    invoke-virtual {p0, v5}, Lio/sentry/x6;->D(Lio/sentry/a7;)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {p0}, Lio/sentry/x6;->B()Lio/sentry/protocol/w;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    sget-object v5, Lio/sentry/protocol/w;->b:Lio/sentry/protocol/w;

    .line 108
    .line 109
    invoke-virtual {p1, v5}, Lio/sentry/protocol/w;->equals(Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    move-result v5

    .line 113
    if-nez v5, :cond_1

    .line 114
    .line 115
    invoke-virtual {p0}, Lio/sentry/x6;->C()Ljava/lang/Boolean;

    .line 116
    .line 117
    .line 118
    move-result-object v5

    .line 119
    invoke-virtual {p2, v5}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    .line 120
    .line 121
    .line 122
    move-result p2

    .line 123
    if-eqz p2, :cond_1

    .line 124
    .line 125
    new-instance p2, Lio/sentry/p3;

    .line 126
    .line 127
    invoke-direct {p2, p1}, Lio/sentry/p3;-><init>(Lio/sentry/protocol/w;)V

    .line 128
    .line 129
    .line 130
    const-string p1, "profile"

    .line 131
    .line 132
    invoke-virtual {v4, p2, p1}, Lio/sentry/protocol/e;->k(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    :cond_1
    if-eqz p4, :cond_2

    .line 136
    .line 137
    invoke-interface {p4, p0}, Lio/sentry/m;->e(Lio/sentry/x6;)V

    .line 138
    .line 139
    .line 140
    :cond_2
    iget-object p1, p3, Lio/sentry/k7;->g:Ljava/lang/Long;

    .line 141
    .line 142
    if-nez p1, :cond_4

    .line 143
    .line 144
    iget-object p1, p3, Lio/sentry/k7;->h:Ljava/lang/Long;

    .line 145
    .line 146
    if-eqz p1, :cond_3

    .line 147
    .line 148
    goto :goto_1

    .line 149
    :cond_3
    return-void

    .line 150
    :cond_4
    :goto_1
    new-instance p1, Ljava/util/Timer;

    .line 151
    .line 152
    const/4 p2, 0x1

    .line 153
    invoke-direct {p1, p2}, Ljava/util/Timer;-><init>(Z)V

    .line 154
    .line 155
    .line 156
    iput-object p1, p0, Lio/sentry/x6;->i:Ljava/util/Timer;

    .line 157
    .line 158
    iget-object p1, p3, Lio/sentry/k7;->h:Ljava/lang/Long;

    .line 159
    .line 160
    if-eqz p1, :cond_8

    .line 161
    .line 162
    invoke-virtual {v1}, Lio/sentry/util/a;->c()V

    .line 163
    .line 164
    .line 165
    :try_start_0
    iget-object p3, p0, Lio/sentry/x6;->i:Ljava/util/Timer;

    .line 166
    .line 167
    if-eqz p3, :cond_7

    .line 168
    .line 169
    invoke-virtual {p0}, Lio/sentry/x6;->x()V

    .line 170
    .line 171
    .line 172
    invoke-virtual {v2, p2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 173
    .line 174
    .line 175
    new-instance p3, Lio/sentry/v6;

    .line 176
    .line 177
    invoke-direct {p3, p0, p2}, Lio/sentry/v6;-><init>(Lio/sentry/x6;I)V

    .line 178
    .line 179
    .line 180
    iput-object p3, p0, Lio/sentry/x6;->h:Lio/sentry/v6;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 181
    .line 182
    :try_start_1
    iget-object p3, p0, Lio/sentry/x6;->i:Ljava/util/Timer;

    .line 183
    .line 184
    iget-object p4, p0, Lio/sentry/x6;->h:Lio/sentry/v6;

    .line 185
    .line 186
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 187
    .line 188
    .line 189
    move-result-wide v4

    .line 190
    invoke-virtual {p3, p4, v4, v5}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 191
    .line 192
    .line 193
    goto :goto_4

    .line 194
    :catchall_0
    move-exception p1

    .line 195
    :try_start_2
    iget-object p3, p0, Lio/sentry/x6;->d:Lio/sentry/g4;

    .line 196
    .line 197
    invoke-virtual {p3}, Lio/sentry/g4;->l()Lio/sentry/m6;

    .line 198
    .line 199
    .line 200
    move-result-object p3

    .line 201
    invoke-virtual {p3}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 202
    .line 203
    .line 204
    move-result-object p3

    .line 205
    sget-object p4, Lio/sentry/m5;->WARNING:Lio/sentry/m5;

    .line 206
    .line 207
    const-string v2, "Failed to schedule finish timer"

    .line 208
    .line 209
    invoke-interface {p3, p4, v2, p1}, Lio/sentry/ILogger;->d(Lio/sentry/m5;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 210
    .line 211
    .line 212
    invoke-virtual {p0}, Lio/sentry/x6;->getStatus()Lio/sentry/f7;

    .line 213
    .line 214
    .line 215
    move-result-object p1

    .line 216
    if-eqz p1, :cond_5

    .line 217
    .line 218
    goto :goto_2

    .line 219
    :cond_5
    sget-object p1, Lio/sentry/f7;->DEADLINE_EXCEEDED:Lio/sentry/f7;

    .line 220
    .line 221
    :goto_2
    iget-object p3, p0, Lio/sentry/x6;->r:Lio/sentry/k7;

    .line 222
    .line 223
    iget-object p3, p3, Lio/sentry/k7;->g:Ljava/lang/Long;

    .line 224
    .line 225
    if-eqz p3, :cond_6

    .line 226
    .line 227
    goto :goto_3

    .line 228
    :cond_6
    move p2, v3

    .line 229
    :goto_3
    invoke-virtual {p0, p1, p2, v0}, Lio/sentry/x6;->e(Lio/sentry/f7;ZLio/sentry/i0;)V

    .line 230
    .line 231
    .line 232
    iget-object p1, p0, Lio/sentry/x6;->m:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 233
    .line 234
    invoke-virtual {p1, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 235
    .line 236
    .line 237
    goto :goto_4

    .line 238
    :catchall_1
    move-exception p0

    .line 239
    goto :goto_5

    .line 240
    :cond_7
    :goto_4
    invoke-virtual {v1}, Lio/sentry/util/a;->close()V

    .line 241
    .line 242
    .line 243
    goto :goto_7

    .line 244
    :goto_5
    :try_start_3
    invoke-virtual {v1}, Lio/sentry/util/a;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 245
    .line 246
    .line 247
    goto :goto_6

    .line 248
    :catchall_2
    move-exception p1

    .line 249
    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 250
    .line 251
    .line 252
    :goto_6
    throw p0

    .line 253
    :cond_8
    :goto_7
    invoke-virtual {p0}, Lio/sentry/x6;->q()V

    .line 254
    .line 255
    .line 256
    return-void
.end method


# virtual methods
.method public final A(Lio/sentry/f7;Lio/sentry/t4;ZLio/sentry/i0;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lio/sentry/x6;->b:Lio/sentry/a7;

    .line 2
    .line 3
    iget-object v0, v0, Lio/sentry/a7;->b:Lio/sentry/t4;

    .line 4
    .line 5
    if-eqz p2, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    move-object p2, v0

    .line 9
    :goto_0
    if-nez p2, :cond_1

    .line 10
    .line 11
    iget-object p2, p0, Lio/sentry/x6;->d:Lio/sentry/g4;

    .line 12
    .line 13
    invoke-virtual {p2}, Lio/sentry/g4;->l()Lio/sentry/m6;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    invoke-virtual {p2}, Lio/sentry/m6;->getDateProvider()Lio/sentry/u4;

    .line 18
    .line 19
    .line 20
    move-result-object p2

    .line 21
    invoke-interface {p2}, Lio/sentry/u4;->a()Lio/sentry/t4;

    .line 22
    .line 23
    .line 24
    move-result-object p2

    .line 25
    :cond_1
    iget-object v0, p0, Lio/sentry/x6;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-eqz v1, :cond_2

    .line 36
    .line 37
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    check-cast v1, Lio/sentry/a7;

    .line 42
    .line 43
    iget-object v1, v1, Lio/sentry/a7;->i:Lio/sentry/e7;

    .line 44
    .line 45
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_2
    new-instance v0, Lio/sentry/w6;

    .line 50
    .line 51
    const/4 v1, 0x1

    .line 52
    invoke-direct {v0, v1, p1}, Lio/sentry/w6;-><init>(ZLio/sentry/f7;)V

    .line 53
    .line 54
    .line 55
    iput-object v0, p0, Lio/sentry/x6;->f:Lio/sentry/w6;

    .line 56
    .line 57
    iget-object p1, p0, Lio/sentry/x6;->b:Lio/sentry/a7;

    .line 58
    .line 59
    iget-boolean p1, p1, Lio/sentry/a7;->g:Z

    .line 60
    .line 61
    if-nez p1, :cond_c

    .line 62
    .line 63
    iget-object p1, p0, Lio/sentry/x6;->r:Lio/sentry/k7;

    .line 64
    .line 65
    iget-boolean p1, p1, Lio/sentry/k7;->f:Z

    .line 66
    .line 67
    if-eqz p1, :cond_4

    .line 68
    .line 69
    iget-object p1, p0, Lio/sentry/x6;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 70
    .line 71
    invoke-virtual {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->listIterator()Ljava/util/ListIterator;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    :cond_3
    invoke-interface {p1}, Ljava/util/ListIterator;->hasNext()Z

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    if-eqz v0, :cond_4

    .line 80
    .line 81
    invoke-interface {p1}, Ljava/util/ListIterator;->next()Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    check-cast v0, Lio/sentry/a7;

    .line 86
    .line 87
    iget-boolean v1, v0, Lio/sentry/a7;->g:Z

    .line 88
    .line 89
    if-nez v1, :cond_3

    .line 90
    .line 91
    iget-object v0, v0, Lio/sentry/a7;->b:Lio/sentry/t4;

    .line 92
    .line 93
    if-nez v0, :cond_3

    .line 94
    .line 95
    return-void

    .line 96
    :cond_4
    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    .line 97
    .line 98
    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 99
    .line 100
    .line 101
    iget-object v0, p0, Lio/sentry/x6;->b:Lio/sentry/a7;

    .line 102
    .line 103
    iget-object v1, v0, Lio/sentry/a7;->j:Lio/sentry/c7;

    .line 104
    .line 105
    new-instance v2, Lpr;

    .line 106
    .line 107
    const/16 v3, 0x8

    .line 108
    .line 109
    invoke-direct {v2, v3, p0, v1, p1}, Lpr;-><init>(ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 110
    .line 111
    .line 112
    iput-object v2, v0, Lio/sentry/a7;->j:Lio/sentry/c7;

    .line 113
    .line 114
    iget-object v1, p0, Lio/sentry/x6;->f:Lio/sentry/w6;

    .line 115
    .line 116
    iget-object v1, v1, Lio/sentry/w6;->b:Lio/sentry/f7;

    .line 117
    .line 118
    invoke-virtual {v0, v1, p2}, Lio/sentry/a7;->v(Lio/sentry/f7;Lio/sentry/t4;)V

    .line 119
    .line 120
    .line 121
    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 122
    .line 123
    invoke-virtual {p0}, Lio/sentry/x6;->C()Ljava/lang/Boolean;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    invoke-virtual {p2, v0}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    .line 128
    .line 129
    .line 130
    move-result v0

    .line 131
    const/4 v1, 0x0

    .line 132
    if-eqz v0, :cond_6

    .line 133
    .line 134
    iget-object v0, p0, Lio/sentry/x6;->b:Lio/sentry/a7;

    .line 135
    .line 136
    iget-object v0, v0, Lio/sentry/a7;->c:Lio/sentry/b7;

    .line 137
    .line 138
    iget-object v0, v0, Lio/sentry/b7;->d:Lio/sentry/t3;

    .line 139
    .line 140
    if-nez v0, :cond_5

    .line 141
    .line 142
    move-object v0, v1

    .line 143
    goto :goto_2

    .line 144
    :cond_5
    iget-object v0, v0, Lio/sentry/t3;->d:Ljava/lang/Object;

    .line 145
    .line 146
    check-cast v0, Ljava/lang/Boolean;

    .line 147
    .line 148
    :goto_2
    invoke-virtual {p2, v0}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    .line 149
    .line 150
    .line 151
    move-result p2

    .line 152
    if-eqz p2, :cond_6

    .line 153
    .line 154
    iget-object p2, p0, Lio/sentry/x6;->d:Lio/sentry/g4;

    .line 155
    .line 156
    invoke-virtual {p2}, Lio/sentry/g4;->l()Lio/sentry/m6;

    .line 157
    .line 158
    .line 159
    move-result-object p2

    .line 160
    invoke-virtual {p2}, Lio/sentry/m6;->getTransactionProfiler()Lio/sentry/n1;

    .line 161
    .line 162
    .line 163
    move-result-object p2

    .line 164
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object v0

    .line 168
    check-cast v0, Ljava/util/List;

    .line 169
    .line 170
    iget-object v2, p0, Lio/sentry/x6;->d:Lio/sentry/g4;

    .line 171
    .line 172
    invoke-virtual {v2}, Lio/sentry/g4;->l()Lio/sentry/m6;

    .line 173
    .line 174
    .line 175
    move-result-object v2

    .line 176
    invoke-interface {p2, p0, v0, v2}, Lio/sentry/n1;->f(Lio/sentry/x6;Ljava/util/List;Lio/sentry/m6;)Lio/sentry/r3;

    .line 177
    .line 178
    .line 179
    move-result-object p2

    .line 180
    goto :goto_3

    .line 181
    :cond_6
    move-object p2, v1

    .line 182
    :goto_3
    iget-object v0, p0, Lio/sentry/x6;->d:Lio/sentry/g4;

    .line 183
    .line 184
    invoke-virtual {v0}, Lio/sentry/g4;->l()Lio/sentry/m6;

    .line 185
    .line 186
    .line 187
    move-result-object v0

    .line 188
    invoke-virtual {v0}, Lio/sentry/m6;->isContinuousProfilingEnabled()Z

    .line 189
    .line 190
    .line 191
    move-result v0

    .line 192
    if-eqz v0, :cond_7

    .line 193
    .line 194
    iget-object v0, p0, Lio/sentry/x6;->d:Lio/sentry/g4;

    .line 195
    .line 196
    invoke-virtual {v0}, Lio/sentry/g4;->l()Lio/sentry/m6;

    .line 197
    .line 198
    .line 199
    move-result-object v0

    .line 200
    invoke-virtual {v0}, Lio/sentry/m6;->getProfileLifecycle()Lio/sentry/q3;

    .line 201
    .line 202
    .line 203
    move-result-object v0

    .line 204
    sget-object v2, Lio/sentry/q3;->TRACE:Lio/sentry/q3;

    .line 205
    .line 206
    if-ne v0, v2, :cond_7

    .line 207
    .line 208
    iget-object v0, p0, Lio/sentry/x6;->b:Lio/sentry/a7;

    .line 209
    .line 210
    iget-object v0, v0, Lio/sentry/a7;->c:Lio/sentry/b7;

    .line 211
    .line 212
    iget-object v0, v0, Lio/sentry/b7;->Z:Lio/sentry/protocol/w;

    .line 213
    .line 214
    sget-object v3, Lio/sentry/protocol/w;->b:Lio/sentry/protocol/w;

    .line 215
    .line 216
    invoke-virtual {v0, v3}, Lio/sentry/protocol/w;->equals(Ljava/lang/Object;)Z

    .line 217
    .line 218
    .line 219
    move-result v0

    .line 220
    if-eqz v0, :cond_7

    .line 221
    .line 222
    iget-object v0, p0, Lio/sentry/x6;->d:Lio/sentry/g4;

    .line 223
    .line 224
    invoke-virtual {v0}, Lio/sentry/g4;->l()Lio/sentry/m6;

    .line 225
    .line 226
    .line 227
    move-result-object v0

    .line 228
    invoke-virtual {v0}, Lio/sentry/m6;->getContinuousProfiler()Lio/sentry/r0;

    .line 229
    .line 230
    .line 231
    move-result-object v0

    .line 232
    invoke-interface {v0, v2}, Lio/sentry/r0;->b(Lio/sentry/q3;)V

    .line 233
    .line 234
    .line 235
    :cond_7
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 236
    .line 237
    .line 238
    move-result-object v0

    .line 239
    if-eqz v0, :cond_8

    .line 240
    .line 241
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 242
    .line 243
    .line 244
    move-result-object p1

    .line 245
    check-cast p1, Ljava/util/List;

    .line 246
    .line 247
    invoke-interface {p1}, Ljava/util/List;->clear()V

    .line 248
    .line 249
    .line 250
    :cond_8
    iget-object p1, p0, Lio/sentry/x6;->d:Lio/sentry/g4;

    .line 251
    .line 252
    new-instance v0, Lio/sentry/u6;

    .line 253
    .line 254
    invoke-direct {v0, p0}, Lio/sentry/u6;-><init>(Lio/sentry/x6;)V

    .line 255
    .line 256
    .line 257
    invoke-virtual {p1, v0}, Lio/sentry/g4;->r(Lio/sentry/d4;)V

    .line 258
    .line 259
    .line 260
    new-instance p1, Lio/sentry/protocol/f0;

    .line 261
    .line 262
    invoke-direct {p1, p0}, Lio/sentry/protocol/f0;-><init>(Lio/sentry/x6;)V

    .line 263
    .line 264
    .line 265
    iget-object v0, p0, Lio/sentry/x6;->i:Ljava/util/Timer;

    .line 266
    .line 267
    if-eqz v0, :cond_a

    .line 268
    .line 269
    iget-object v0, p0, Lio/sentry/x6;->j:Lio/sentry/util/a;

    .line 270
    .line 271
    invoke-virtual {v0}, Lio/sentry/util/a;->c()V

    .line 272
    .line 273
    .line 274
    :try_start_0
    iget-object v2, p0, Lio/sentry/x6;->i:Ljava/util/Timer;

    .line 275
    .line 276
    if-eqz v2, :cond_9

    .line 277
    .line 278
    invoke-virtual {p0}, Lio/sentry/x6;->y()V

    .line 279
    .line 280
    .line 281
    invoke-virtual {p0}, Lio/sentry/x6;->x()V

    .line 282
    .line 283
    .line 284
    iget-object v2, p0, Lio/sentry/x6;->i:Ljava/util/Timer;

    .line 285
    .line 286
    invoke-virtual {v2}, Ljava/util/Timer;->cancel()V

    .line 287
    .line 288
    .line 289
    iput-object v1, p0, Lio/sentry/x6;->i:Ljava/util/Timer;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 290
    .line 291
    goto :goto_4

    .line 292
    :catchall_0
    move-exception p0

    .line 293
    goto :goto_5

    .line 294
    :cond_9
    :goto_4
    invoke-virtual {v0}, Lio/sentry/util/a;->close()V

    .line 295
    .line 296
    .line 297
    goto :goto_7

    .line 298
    :goto_5
    :try_start_1
    invoke-virtual {v0}, Lio/sentry/util/a;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 299
    .line 300
    .line 301
    goto :goto_6

    .line 302
    :catchall_1
    move-exception p1

    .line 303
    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 304
    .line 305
    .line 306
    :goto_6
    throw p0

    .line 307
    :cond_a
    :goto_7
    if-eqz p3, :cond_b

    .line 308
    .line 309
    iget-object p3, p0, Lio/sentry/x6;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 310
    .line 311
    invoke-virtual {p3}, Ljava/util/concurrent/CopyOnWriteArrayList;->isEmpty()Z

    .line 312
    .line 313
    .line 314
    move-result p3

    .line 315
    if-eqz p3, :cond_b

    .line 316
    .line 317
    iget-object p3, p0, Lio/sentry/x6;->r:Lio/sentry/k7;

    .line 318
    .line 319
    iget-object p3, p3, Lio/sentry/k7;->g:Ljava/lang/Long;

    .line 320
    .line 321
    if-eqz p3, :cond_b

    .line 322
    .line 323
    iget-object p1, p0, Lio/sentry/x6;->d:Lio/sentry/g4;

    .line 324
    .line 325
    invoke-virtual {p1}, Lio/sentry/g4;->l()Lio/sentry/m6;

    .line 326
    .line 327
    .line 328
    move-result-object p1

    .line 329
    invoke-virtual {p1}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 330
    .line 331
    .line 332
    move-result-object p1

    .line 333
    sget-object p2, Lio/sentry/m5;->DEBUG:Lio/sentry/m5;

    .line 334
    .line 335
    iget-object p0, p0, Lio/sentry/x6;->e:Ljava/lang/String;

    .line 336
    .line 337
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 338
    .line 339
    .line 340
    move-result-object p0

    .line 341
    const-string p3, "Dropping idle transaction %s because it has no child spans"

    .line 342
    .line 343
    invoke-interface {p1, p2, p3, p0}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 344
    .line 345
    .line 346
    return-void

    .line 347
    :cond_b
    iget-object p3, p1, Lio/sentry/protocol/f0;->e0:Ljava/util/HashMap;

    .line 348
    .line 349
    iget-object v0, p0, Lio/sentry/x6;->b:Lio/sentry/a7;

    .line 350
    .line 351
    iget-object v0, v0, Lio/sentry/a7;->l:Ljava/util/concurrent/ConcurrentHashMap;

    .line 352
    .line 353
    invoke-virtual {p3, v0}, Ljava/util/HashMap;->putAll(Ljava/util/Map;)V

    .line 354
    .line 355
    .line 356
    iget-object p3, p0, Lio/sentry/x6;->d:Lio/sentry/g4;

    .line 357
    .line 358
    invoke-virtual {p0}, Lio/sentry/x6;->a()Lio/sentry/h7;

    .line 359
    .line 360
    .line 361
    move-result-object p0

    .line 362
    invoke-virtual {p3, p1, p0, p4, p2}, Lio/sentry/g4;->y(Lio/sentry/protocol/f0;Lio/sentry/h7;Lio/sentry/i0;Lio/sentry/r3;)Lio/sentry/protocol/w;

    .line 363
    .line 364
    .line 365
    :cond_c
    return-void
.end method

.method public final B()Lio/sentry/protocol/w;
    .locals 3

    .line 1
    iget-object v0, p0, Lio/sentry/x6;->b:Lio/sentry/a7;

    .line 2
    .line 3
    iget-object v1, v0, Lio/sentry/a7;->c:Lio/sentry/b7;

    .line 4
    .line 5
    iget-object v1, v1, Lio/sentry/b7;->Z:Lio/sentry/protocol/w;

    .line 6
    .line 7
    sget-object v2, Lio/sentry/protocol/w;->b:Lio/sentry/protocol/w;

    .line 8
    .line 9
    invoke-virtual {v1, v2}, Lio/sentry/protocol/w;->equals(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-nez v1, :cond_0

    .line 14
    .line 15
    iget-object p0, v0, Lio/sentry/a7;->c:Lio/sentry/b7;

    .line 16
    .line 17
    iget-object p0, p0, Lio/sentry/b7;->Z:Lio/sentry/protocol/w;

    .line 18
    .line 19
    return-object p0

    .line 20
    :cond_0
    iget-object p0, p0, Lio/sentry/x6;->d:Lio/sentry/g4;

    .line 21
    .line 22
    invoke-virtual {p0}, Lio/sentry/g4;->l()Lio/sentry/m6;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-virtual {p0}, Lio/sentry/m6;->getContinuousProfiler()Lio/sentry/r0;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    invoke-interface {p0}, Lio/sentry/r0;->e()Lio/sentry/protocol/w;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    return-object p0
.end method

.method public final C()Ljava/lang/Boolean;
    .locals 0

    .line 1
    iget-object p0, p0, Lio/sentry/x6;->b:Lio/sentry/a7;

    .line 2
    .line 3
    iget-object p0, p0, Lio/sentry/a7;->c:Lio/sentry/b7;

    .line 4
    .line 5
    iget-object p0, p0, Lio/sentry/b7;->d:Lio/sentry/t3;

    .line 6
    .line 7
    if-nez p0, :cond_0

    .line 8
    .line 9
    const/4 p0, 0x0

    .line 10
    return-object p0

    .line 11
    :cond_0
    iget-object p0, p0, Lio/sentry/t3;->a:Ljava/io/Serializable;

    .line 12
    .line 13
    check-cast p0, Ljava/lang/Boolean;

    .line 14
    .line 15
    return-object p0
.end method

.method public final D(Lio/sentry/a7;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lio/sentry/x6;->d:Lio/sentry/g4;

    .line 2
    .line 3
    invoke-virtual {v0}, Lio/sentry/g4;->l()Lio/sentry/m6;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lio/sentry/m6;->getThreadChecker()Lio/sentry/util/thread/a;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {p0}, Lio/sentry/x6;->B()Lio/sentry/protocol/w;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    sget-object v1, Lio/sentry/protocol/w;->b:Lio/sentry/protocol/w;

    .line 16
    .line 17
    invoke-virtual {p0, v1}, Lio/sentry/protocol/w;->equals(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-nez v1, :cond_1

    .line 22
    .line 23
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 24
    .line 25
    iget-object v2, p1, Lio/sentry/a7;->c:Lio/sentry/b7;

    .line 26
    .line 27
    iget-object v2, v2, Lio/sentry/b7;->d:Lio/sentry/t3;

    .line 28
    .line 29
    if-nez v2, :cond_0

    .line 30
    .line 31
    const/4 v2, 0x0

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    iget-object v2, v2, Lio/sentry/t3;->a:Ljava/io/Serializable;

    .line 34
    .line 35
    check-cast v2, Ljava/lang/Boolean;

    .line 36
    .line 37
    :goto_0
    invoke-virtual {v1, v2}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-eqz v1, :cond_1

    .line 42
    .line 43
    const-string v1, "profiler_id"

    .line 44
    .line 45
    invoke-virtual {p0}, Lio/sentry/protocol/w;->a()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    invoke-virtual {p1, p0, v1}, Lio/sentry/a7;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    :cond_1
    invoke-interface {v0}, Lio/sentry/util/thread/a;->b()J

    .line 53
    .line 54
    .line 55
    move-result-wide v1

    .line 56
    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    const-string v1, "thread.id"

    .line 61
    .line 62
    invoke-virtual {p1, p0, v1}, Lio/sentry/a7;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    const-string p0, "thread.name"

    .line 66
    .line 67
    invoke-interface {v0}, Lio/sentry/util/thread/a;->a()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    invoke-virtual {p1, v0, p0}, Lio/sentry/a7;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    return-void
.end method

.method public final E(Lio/sentry/c;)V
    .locals 12

    .line 1
    iget-object v0, p0, Lio/sentry/x6;->b:Lio/sentry/a7;

    .line 2
    .line 3
    iget-object v1, p0, Lio/sentry/x6;->d:Lio/sentry/g4;

    .line 4
    .line 5
    iget-object v2, p0, Lio/sentry/x6;->k:Lio/sentry/util/a;

    .line 6
    .line 7
    invoke-virtual {v2}, Lio/sentry/util/a;->c()V

    .line 8
    .line 9
    .line 10
    :try_start_0
    iget-boolean v3, p1, Lio/sentry/c;->f:Z

    .line 11
    .line 12
    if-eqz v3, :cond_0

    .line 13
    .line 14
    new-instance v3, Ljava/util/concurrent/atomic/AtomicReference;

    .line 15
    .line 16
    invoke-direct {v3}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 17
    .line 18
    .line 19
    new-instance v4, Lx6;

    .line 20
    .line 21
    const/16 v5, 0x18

    .line 22
    .line 23
    invoke-direct {v4, v3, v5}, Lx6;-><init>(Ljava/lang/Object;I)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1, v4}, Lio/sentry/g4;->r(Lio/sentry/d4;)V

    .line 27
    .line 28
    .line 29
    iget-object v4, v0, Lio/sentry/a7;->c:Lio/sentry/b7;

    .line 30
    .line 31
    iget-object v6, v4, Lio/sentry/b7;->a:Lio/sentry/protocol/w;

    .line 32
    .line 33
    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    move-object v7, v3

    .line 38
    check-cast v7, Lio/sentry/protocol/w;

    .line 39
    .line 40
    invoke-virtual {v1}, Lio/sentry/g4;->l()Lio/sentry/m6;

    .line 41
    .line 42
    .line 43
    move-result-object v8

    .line 44
    iget-object v0, v0, Lio/sentry/a7;->c:Lio/sentry/b7;

    .line 45
    .line 46
    iget-object v9, v0, Lio/sentry/b7;->d:Lio/sentry/t3;

    .line 47
    .line 48
    iget-object v10, p0, Lio/sentry/x6;->e:Ljava/lang/String;

    .line 49
    .line 50
    iget-object v11, p0, Lio/sentry/x6;->n:Lio/sentry/protocol/i0;

    .line 51
    .line 52
    move-object v5, p1

    .line 53
    invoke-virtual/range {v5 .. v11}, Lio/sentry/c;->e(Lio/sentry/protocol/w;Lio/sentry/protocol/w;Lio/sentry/m6;Lio/sentry/t3;Ljava/lang/String;Lio/sentry/protocol/i0;)V

    .line 54
    .line 55
    .line 56
    const/4 p0, 0x0

    .line 57
    iput-boolean p0, v5, Lio/sentry/c;->f:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :catchall_0
    move-exception v0

    .line 61
    move-object p0, v0

    .line 62
    goto :goto_1

    .line 63
    :cond_0
    :goto_0
    invoke-virtual {v2}, Lio/sentry/util/a;->close()V

    .line 64
    .line 65
    .line 66
    return-void

    .line 67
    :goto_1
    :try_start_1
    invoke-virtual {v2}, Lio/sentry/util/a;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 68
    .line 69
    .line 70
    goto :goto_2

    .line 71
    :catchall_1
    move-exception v0

    .line 72
    move-object p1, v0

    .line 73
    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 74
    .line 75
    .line 76
    :goto_2
    throw p0
.end method

.method public final a()Lio/sentry/h7;
    .locals 1

    .line 1
    iget-object v0, p0, Lio/sentry/x6;->d:Lio/sentry/g4;

    .line 2
    .line 3
    invoke-virtual {v0}, Lio/sentry/g4;->l()Lio/sentry/m6;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lio/sentry/m6;->isTraceSampling()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Lio/sentry/x6;->b:Lio/sentry/a7;

    .line 14
    .line 15
    iget-object v0, v0, Lio/sentry/a7;->c:Lio/sentry/b7;

    .line 16
    .line 17
    iget-object v0, v0, Lio/sentry/b7;->X:Lio/sentry/c;

    .line 18
    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    invoke-virtual {p0, v0}, Lio/sentry/x6;->E(Lio/sentry/c;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, Lio/sentry/c;->f()Lio/sentry/h7;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0

    .line 29
    :cond_0
    const/4 p0, 0x0

    .line 30
    return-object p0
.end method

.method public final b()Lio/sentry/t6;
    .locals 0

    .line 1
    iget-object p0, p0, Lio/sentry/x6;->b:Lio/sentry/a7;

    .line 2
    .line 3
    invoke-virtual {p0}, Lio/sentry/a7;->b()Lio/sentry/t6;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final c(Ljava/lang/String;Lio/sentry/t4;Lio/sentry/r1;)Lio/sentry/k1;
    .locals 6

    .line 1
    new-instance v5, Lio/sentry/e7;

    .line 2
    .line 3
    invoke-direct {v5}, Lio/sentry/e7;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "activity.load"

    .line 7
    .line 8
    move-object v0, p0

    .line 9
    move-object v2, p1

    .line 10
    move-object v3, p2

    .line 11
    move-object v4, p3

    .line 12
    invoke-virtual/range {v0 .. v5}, Lio/sentry/x6;->n(Ljava/lang/String;Ljava/lang/String;Lio/sentry/t4;Lio/sentry/r1;Lio/sentry/e7;)Lio/sentry/k1;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method

.method public final d()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lio/sentry/x6;->b:Lio/sentry/a7;

    .line 2
    .line 3
    iget-boolean p0, p0, Lio/sentry/a7;->g:Z

    .line 4
    .line 5
    return p0
.end method

.method public final e(Lio/sentry/f7;ZLio/sentry/i0;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lio/sentry/x6;->b:Lio/sentry/a7;

    .line 2
    .line 3
    iget-boolean v0, v0, Lio/sentry/a7;->g:Z

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget-object v0, p0, Lio/sentry/x6;->d:Lio/sentry/g4;

    .line 9
    .line 10
    invoke-virtual {v0}, Lio/sentry/g4;->l()Lio/sentry/m6;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0}, Lio/sentry/m6;->getDateProvider()Lio/sentry/u4;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-interface {v0}, Lio/sentry/u4;->a()Lio/sentry/t4;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    new-instance v1, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 23
    .line 24
    iget-object v2, p0, Lio/sentry/x6;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 25
    .line 26
    invoke-direct {v1, v2}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>(Ljava/util/Collection;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->size()I

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    invoke-virtual {v1, v2}, Ljava/util/concurrent/CopyOnWriteArrayList;->listIterator(I)Ljava/util/ListIterator;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    :goto_0
    invoke-interface {v1}, Ljava/util/ListIterator;->hasPrevious()Z

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    if-eqz v2, :cond_1

    .line 42
    .line 43
    invoke-interface {v1}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    check-cast v2, Lio/sentry/a7;

    .line 48
    .line 49
    const/4 v3, 0x0

    .line 50
    iput-object v3, v2, Lio/sentry/a7;->j:Lio/sentry/c7;

    .line 51
    .line 52
    invoke-virtual {v2, p1, v0}, Lio/sentry/a7;->v(Lio/sentry/f7;Lio/sentry/t4;)V

    .line 53
    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_1
    invoke-virtual {p0, p1, v0, p2, p3}, Lio/sentry/x6;->A(Lio/sentry/f7;Lio/sentry/t4;ZLio/sentry/i0;)V

    .line 57
    .line 58
    .line 59
    return-void
.end method

.method public final f(Lio/sentry/f7;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, p1, v0}, Lio/sentry/x6;->v(Lio/sentry/f7;Lio/sentry/t4;)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public final g()Lio/sentry/protocol/w;
    .locals 0

    .line 1
    iget-object p0, p0, Lio/sentry/x6;->a:Lio/sentry/protocol/w;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getDescription()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lio/sentry/x6;->b:Lio/sentry/a7;

    .line 2
    .line 3
    iget-object p0, p0, Lio/sentry/a7;->c:Lio/sentry/b7;

    .line 4
    .line 5
    iget-object p0, p0, Lio/sentry/b7;->f:Ljava/lang/String;

    .line 6
    .line 7
    return-object p0
.end method

.method public final getName()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lio/sentry/x6;->e:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getStatus()Lio/sentry/f7;
    .locals 0

    .line 1
    iget-object p0, p0, Lio/sentry/x6;->b:Lio/sentry/a7;

    .line 2
    .line 3
    iget-object p0, p0, Lio/sentry/a7;->c:Lio/sentry/b7;

    .line 4
    .line 5
    iget-object p0, p0, Lio/sentry/b7;->i:Lio/sentry/f7;

    .line 6
    .line 7
    return-object p0
.end method

.method public final h(Ljava/io/IOException;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lio/sentry/x6;->b:Lio/sentry/a7;

    .line 2
    .line 3
    iget-boolean v1, v0, Lio/sentry/a7;->g:Z

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    iget-object p0, p0, Lio/sentry/x6;->d:Lio/sentry/g4;

    .line 8
    .line 9
    invoke-virtual {p0}, Lio/sentry/g4;->l()Lio/sentry/m6;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-virtual {p0}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    sget-object p1, Lio/sentry/m5;->DEBUG:Lio/sentry/m5;

    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    new-array v0, v0, [Ljava/lang/Object;

    .line 21
    .line 22
    const-string v1, "The transaction is already finished. Throwable cannot be set"

    .line 23
    .line 24
    invoke-interface {p0, p1, v1, v0}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :cond_0
    iput-object p1, v0, Lio/sentry/a7;->e:Ljava/io/IOException;

    .line 29
    .line 30
    return-void
.end method

.method public final i()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lio/sentry/x6;->getStatus()Lio/sentry/f7;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-virtual {p0, v0, v1}, Lio/sentry/x6;->v(Lio/sentry/f7;Lio/sentry/t4;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final j(Ljava/lang/Object;Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lio/sentry/x6;->b:Lio/sentry/a7;

    .line 2
    .line 3
    iget-boolean v1, v0, Lio/sentry/a7;->g:Z

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    iget-object p0, p0, Lio/sentry/x6;->d:Lio/sentry/g4;

    .line 8
    .line 9
    invoke-virtual {p0}, Lio/sentry/g4;->l()Lio/sentry/m6;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-virtual {p0}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    sget-object p1, Lio/sentry/m5;->DEBUG:Lio/sentry/m5;

    .line 18
    .line 19
    const-string v0, "The transaction is already finished. Data %s cannot be set"

    .line 20
    .line 21
    filled-new-array {p2}, [Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p2

    .line 25
    invoke-interface {p0, p1, v0, p2}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :cond_0
    invoke-virtual {v0, p1, p2}, Lio/sentry/a7;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public final k()Lio/sentry/d;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const-string v1, "%20"

    .line 4
    .line 5
    const-string v2, "\\+"

    .line 6
    .line 7
    const-string v3, "UTF-8"

    .line 8
    .line 9
    iget-object v4, v0, Lio/sentry/x6;->d:Lio/sentry/g4;

    .line 10
    .line 11
    invoke-virtual {v4}, Lio/sentry/g4;->l()Lio/sentry/m6;

    .line 12
    .line 13
    .line 14
    move-result-object v4

    .line 15
    invoke-virtual {v4}, Lio/sentry/m6;->isTraceSampling()Z

    .line 16
    .line 17
    .line 18
    move-result v4

    .line 19
    const/4 v5, 0x0

    .line 20
    if-eqz v4, :cond_a

    .line 21
    .line 22
    iget-object v4, v0, Lio/sentry/x6;->b:Lio/sentry/a7;

    .line 23
    .line 24
    iget-object v4, v4, Lio/sentry/a7;->c:Lio/sentry/b7;

    .line 25
    .line 26
    iget-object v4, v4, Lio/sentry/b7;->X:Lio/sentry/c;

    .line 27
    .line 28
    if-eqz v4, :cond_a

    .line 29
    .line 30
    iget-object v6, v4, Lio/sentry/c;->h:Lio/sentry/ILogger;

    .line 31
    .line 32
    invoke-virtual {v0, v4}, Lio/sentry/x6;->E(Lio/sentry/c;)V

    .line 33
    .line 34
    .line 35
    const/4 v0, 0x1

    .line 36
    invoke-static {v6, v5, v0}, Lio/sentry/c;->a(Lio/sentry/ILogger;Ljava/lang/String;Z)Lio/sentry/c;

    .line 37
    .line 38
    .line 39
    move-result-object v7

    .line 40
    iget-object v7, v7, Lio/sentry/c;->e:Ljava/lang/String;

    .line 41
    .line 42
    iget-object v8, v4, Lio/sentry/c;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 43
    .line 44
    new-instance v9, Ljava/lang/StringBuilder;

    .line 45
    .line 46
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 47
    .line 48
    .line 49
    const-string v10, ","

    .line 50
    .line 51
    const/4 v11, 0x0

    .line 52
    if-eqz v7, :cond_2

    .line 53
    .line 54
    invoke-virtual {v7}, Ljava/lang/String;->isEmpty()Z

    .line 55
    .line 56
    .line 57
    move-result v12

    .line 58
    if-nez v12, :cond_2

    .line 59
    .line 60
    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    sget-object v12, Lio/sentry/util/o;->a:Ljava/nio/charset/Charset;

    .line 64
    .line 65
    move v12, v11

    .line 66
    :goto_0
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 67
    .line 68
    .line 69
    move-result v13

    .line 70
    if-ge v11, v13, :cond_1

    .line 71
    .line 72
    invoke-virtual {v7, v11}, Ljava/lang/String;->charAt(I)C

    .line 73
    .line 74
    .line 75
    move-result v13

    .line 76
    const/16 v14, 0x2c

    .line 77
    .line 78
    if-ne v13, v14, :cond_0

    .line 79
    .line 80
    add-int/lit8 v12, v12, 0x1

    .line 81
    .line 82
    :cond_0
    add-int/lit8 v11, v11, 0x1

    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_1
    add-int/lit8 v11, v12, 0x1

    .line 86
    .line 87
    move-object v0, v10

    .line 88
    goto :goto_1

    .line 89
    :cond_2
    const-string v0, ""

    .line 90
    .line 91
    :goto_1
    iget-object v7, v4, Lio/sentry/c;->b:Lio/sentry/util/a;

    .line 92
    .line 93
    invoke-virtual {v7}, Lio/sentry/util/a;->c()V

    .line 94
    .line 95
    .line 96
    :try_start_0
    new-instance v12, Ljava/util/TreeSet;

    .line 97
    .line 98
    invoke-virtual {v8}, Ljava/util/concurrent/ConcurrentHashMap;->keys()Ljava/util/Enumeration;

    .line 99
    .line 100
    .line 101
    move-result-object v13

    .line 102
    invoke-static {v13}, Ljava/util/Collections;->list(Ljava/util/Enumeration;)Ljava/util/ArrayList;

    .line 103
    .line 104
    .line 105
    move-result-object v13

    .line 106
    invoke-direct {v12, v13}, Ljava/util/TreeSet;-><init>(Ljava/util/Collection;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    .line 107
    .line 108
    .line 109
    invoke-virtual {v7}, Lio/sentry/util/a;->close()V

    .line 110
    .line 111
    .line 112
    const-string v7, "sentry-sample_rate"

    .line 113
    .line 114
    invoke-virtual {v12, v7}, Ljava/util/TreeSet;->add(Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    const-string v13, "sentry-sample_rand"

    .line 118
    .line 119
    invoke-virtual {v12, v13}, Ljava/util/TreeSet;->add(Ljava/lang/Object;)Z

    .line 120
    .line 121
    .line 122
    invoke-virtual {v12}, Ljava/util/TreeSet;->iterator()Ljava/util/Iterator;

    .line 123
    .line 124
    .line 125
    move-result-object v12

    .line 126
    move v14, v11

    .line 127
    move-object v11, v0

    .line 128
    :goto_2
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    .line 129
    .line 130
    .line 131
    move-result v0

    .line 132
    if-eqz v0, :cond_8

    .line 133
    .line 134
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    move-object v15, v0

    .line 139
    check-cast v15, Ljava/lang/String;

    .line 140
    .line 141
    invoke-virtual {v7, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    move-result v0

    .line 145
    if-eqz v0, :cond_3

    .line 146
    .line 147
    iget-object v0, v4, Lio/sentry/c;->c:Ljava/lang/Double;

    .line 148
    .line 149
    invoke-static {v0}, Lio/sentry/c;->c(Ljava/lang/Double;)Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object v0

    .line 153
    :goto_3
    move-object/from16 v16, v5

    .line 154
    .line 155
    move-object v5, v0

    .line 156
    goto :goto_4

    .line 157
    :cond_3
    invoke-virtual {v13, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 158
    .line 159
    .line 160
    move-result v0

    .line 161
    if-eqz v0, :cond_4

    .line 162
    .line 163
    iget-object v0, v4, Lio/sentry/c;->d:Ljava/lang/Double;

    .line 164
    .line 165
    invoke-static {v0}, Lio/sentry/c;->c(Ljava/lang/Double;)Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object v0

    .line 169
    goto :goto_3

    .line 170
    :cond_4
    invoke-virtual {v8, v15}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object v0

    .line 174
    check-cast v0, Ljava/lang/String;

    .line 175
    .line 176
    goto :goto_3

    .line 177
    :goto_4
    if-eqz v5, :cond_5

    .line 178
    .line 179
    const/16 v0, 0x40

    .line 180
    .line 181
    if-lt v14, v0, :cond_6

    .line 182
    .line 183
    sget-object v5, Lio/sentry/m5;->ERROR:Lio/sentry/m5;

    .line 184
    .line 185
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 186
    .line 187
    .line 188
    move-result-object v0

    .line 189
    filled-new-array {v15, v0}, [Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    move-result-object v0

    .line 193
    const-string v15, "Not adding baggage value %s as the total number of list members would exceed the maximum of %s."

    .line 194
    .line 195
    invoke-interface {v6, v5, v15, v0}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 196
    .line 197
    .line 198
    :cond_5
    move-object/from16 v18, v1

    .line 199
    .line 200
    move-object/from16 v17, v4

    .line 201
    .line 202
    goto :goto_6

    .line 203
    :cond_6
    :try_start_1
    invoke-static {v15, v3}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 204
    .line 205
    .line 206
    move-result-object v0

    .line 207
    invoke-virtual {v0, v2, v1}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 208
    .line 209
    .line 210
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 211
    move-object/from16 v17, v4

    .line 212
    .line 213
    :try_start_2
    invoke-static {v5, v3}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 214
    .line 215
    .line 216
    move-result-object v4

    .line 217
    invoke-virtual {v4, v2, v1}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 218
    .line 219
    .line 220
    move-result-object v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 221
    move-object/from16 v18, v1

    .line 222
    .line 223
    :try_start_3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 224
    .line 225
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 226
    .line 227
    .line 228
    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 229
    .line 230
    .line 231
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 232
    .line 233
    .line 234
    const-string v0, "="

    .line 235
    .line 236
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 237
    .line 238
    .line 239
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 240
    .line 241
    .line 242
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 243
    .line 244
    .line 245
    move-result-object v0

    .line 246
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 247
    .line 248
    .line 249
    move-result v1

    .line 250
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->length()I

    .line 251
    .line 252
    .line 253
    move-result v4

    .line 254
    add-int/2addr v4, v1

    .line 255
    const/16 v1, 0x2000

    .line 256
    .line 257
    if-le v4, v1, :cond_7

    .line 258
    .line 259
    sget-object v0, Lio/sentry/m5;->ERROR:Lio/sentry/m5;

    .line 260
    .line 261
    const-string v4, "Not adding baggage value %s as the total header value length would exceed the maximum of %s."

    .line 262
    .line 263
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 264
    .line 265
    .line 266
    move-result-object v1

    .line 267
    filled-new-array {v15, v1}, [Ljava/lang/Object;

    .line 268
    .line 269
    .line 270
    move-result-object v1

    .line 271
    invoke-interface {v6, v0, v4, v1}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 272
    .line 273
    .line 274
    goto :goto_6

    .line 275
    :catchall_0
    move-exception v0

    .line 276
    goto :goto_5

    .line 277
    :cond_7
    add-int/lit8 v14, v14, 0x1

    .line 278
    .line 279
    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 280
    .line 281
    .line 282
    move-object v11, v10

    .line 283
    goto :goto_6

    .line 284
    :catchall_1
    move-exception v0

    .line 285
    move-object/from16 v18, v1

    .line 286
    .line 287
    goto :goto_5

    .line 288
    :catchall_2
    move-exception v0

    .line 289
    move-object/from16 v18, v1

    .line 290
    .line 291
    move-object/from16 v17, v4

    .line 292
    .line 293
    :goto_5
    sget-object v1, Lio/sentry/m5;->ERROR:Lio/sentry/m5;

    .line 294
    .line 295
    const-string v4, "Unable to encode baggage key value pair (key=%s,value=%s)."

    .line 296
    .line 297
    filled-new-array {v15, v5}, [Ljava/lang/Object;

    .line 298
    .line 299
    .line 300
    move-result-object v5

    .line 301
    invoke-interface {v6, v1, v0, v4, v5}, Lio/sentry/ILogger;->b(Lio/sentry/m5;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 302
    .line 303
    .line 304
    :goto_6
    move-object/from16 v5, v16

    .line 305
    .line 306
    move-object/from16 v4, v17

    .line 307
    .line 308
    move-object/from16 v1, v18

    .line 309
    .line 310
    goto/16 :goto_2

    .line 311
    .line 312
    :cond_8
    move-object/from16 v16, v5

    .line 313
    .line 314
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 315
    .line 316
    .line 317
    move-result-object v0

    .line 318
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 319
    .line 320
    .line 321
    move-result v1

    .line 322
    if-eqz v1, :cond_9

    .line 323
    .line 324
    move-object/from16 v5, v16

    .line 325
    .line 326
    goto :goto_7

    .line 327
    :cond_9
    new-instance v5, Lio/sentry/d;

    .line 328
    .line 329
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 330
    .line 331
    .line 332
    iput-object v0, v5, Lio/sentry/d;->a:Ljava/lang/String;

    .line 333
    .line 334
    :goto_7
    return-object v5

    .line 335
    :catchall_3
    move-exception v0

    .line 336
    move-object v1, v0

    .line 337
    :try_start_4
    invoke-virtual {v7}, Lio/sentry/util/a;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 338
    .line 339
    .line 340
    goto :goto_8

    .line 341
    :catchall_4
    move-exception v0

    .line 342
    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 343
    .line 344
    .line 345
    :goto_8
    throw v1

    .line 346
    :cond_a
    move-object/from16 v16, v5

    .line 347
    .line 348
    return-object v16
.end method

.method public final l()V
    .locals 3

    .line 1
    iget-object v0, p0, Lio/sentry/x6;->d:Lio/sentry/g4;

    .line 2
    .line 3
    invoke-virtual {v0}, Lio/sentry/g4;->isEnabled()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, Lio/sentry/g4;->l()Lio/sentry/m6;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-virtual {p0}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    sget-object v0, Lio/sentry/m5;->WARNING:Lio/sentry/m5;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    new-array v1, v1, [Ljava/lang/Object;

    .line 21
    .line 22
    const-string v2, "Instance is disabled and this \'configureScope\' call is a no-op."

    .line 23
    .line 24
    invoke-interface {p0, v0, v2, v1}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    :try_start_0
    iget-object v1, v0, Lio/sentry/g4;->e:Lio/sentry/l;

    .line 29
    .line 30
    const/4 v2, 0x0

    .line 31
    invoke-virtual {v1, v2}, Lio/sentry/l;->Q(Lio/sentry/f4;)Lio/sentry/a1;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-interface {v1, p0}, Lio/sentry/a1;->I(Lio/sentry/m1;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :catchall_0
    move-exception p0

    .line 40
    invoke-virtual {v0}, Lio/sentry/g4;->l()Lio/sentry/m6;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-virtual {v0}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    sget-object v1, Lio/sentry/m5;->ERROR:Lio/sentry/m5;

    .line 49
    .line 50
    const-string v2, "Error in the \'configureScope\' callback."

    .line 51
    .line 52
    invoke-interface {v0, v1, v2, p0}, Lio/sentry/ILogger;->d(Lio/sentry/m5;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 53
    .line 54
    .line 55
    :goto_0
    return-void
.end method

.method public final m()Lio/sentry/k1;
    .locals 2

    .line 1
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 2
    .line 3
    iget-object p0, p0, Lio/sentry/x6;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 4
    .line 5
    invoke-direct {v0, p0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>(Ljava/util/Collection;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->size()I

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    invoke-virtual {v0, p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->listIterator(I)Ljava/util/ListIterator;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    :cond_0
    invoke-interface {p0}, Ljava/util/ListIterator;->hasPrevious()Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    invoke-interface {p0}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    check-cast v0, Lio/sentry/a7;

    .line 27
    .line 28
    iget-boolean v1, v0, Lio/sentry/a7;->g:Z

    .line 29
    .line 30
    if-nez v1, :cond_0

    .line 31
    .line 32
    return-object v0

    .line 33
    :cond_1
    const/4 p0, 0x0

    .line 34
    return-object p0
.end method

.method public final n(Ljava/lang/String;Ljava/lang/String;Lio/sentry/t4;Lio/sentry/r1;Lio/sentry/e7;)Lio/sentry/k1;
    .locals 4

    .line 1
    iget-object v0, p0, Lio/sentry/x6;->b:Lio/sentry/a7;

    .line 2
    .line 3
    iget-boolean v0, v0, Lio/sentry/a7;->g:Z

    .line 4
    .line 5
    sget-object v1, Lio/sentry/d3;->a:Lio/sentry/d3;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    iget-object v0, p0, Lio/sentry/x6;->o:Lio/sentry/r1;

    .line 11
    .line 12
    invoke-virtual {v0, p4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-nez v0, :cond_1

    .line 17
    .line 18
    :goto_0
    return-object v1

    .line 19
    :cond_1
    iget-object v0, p0, Lio/sentry/x6;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->size()I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    iget-object v2, p0, Lio/sentry/x6;->d:Lio/sentry/g4;

    .line 26
    .line 27
    invoke-virtual {v2}, Lio/sentry/g4;->l()Lio/sentry/m6;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    invoke-virtual {v3}, Lio/sentry/m6;->getMaxSpans()I

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    if-ge v0, v3, :cond_2

    .line 36
    .line 37
    iget-object p0, p0, Lio/sentry/x6;->b:Lio/sentry/a7;

    .line 38
    .line 39
    invoke-virtual/range {p0 .. p5}, Lio/sentry/a7;->n(Ljava/lang/String;Ljava/lang/String;Lio/sentry/t4;Lio/sentry/r1;Lio/sentry/e7;)Lio/sentry/k1;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    return-object p0

    .line 44
    :cond_2
    invoke-virtual {v2}, Lio/sentry/g4;->l()Lio/sentry/m6;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    invoke-virtual {p0}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    sget-object p3, Lio/sentry/m5;->WARNING:Lio/sentry/m5;

    .line 53
    .line 54
    const-string p4, "Span operation: %s, description: %s dropped due to limit reached. Returning NoOpSpan."

    .line 55
    .line 56
    filled-new-array {p1, p2}, [Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    invoke-interface {p0, p3, p4, p1}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    return-object v1
.end method

.method public final o(Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lio/sentry/x6;->b:Lio/sentry/a7;

    .line 2
    .line 3
    iget-boolean v1, v0, Lio/sentry/a7;->g:Z

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    iget-object p0, p0, Lio/sentry/x6;->d:Lio/sentry/g4;

    .line 8
    .line 9
    invoke-virtual {p0}, Lio/sentry/g4;->l()Lio/sentry/m6;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-virtual {p0}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    sget-object v0, Lio/sentry/m5;->DEBUG:Lio/sentry/m5;

    .line 18
    .line 19
    const-string v1, "The transaction is already finished. Description %s cannot be set"

    .line 20
    .line 21
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-interface {p0, v0, v1, p1}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :cond_0
    iget-object p0, v0, Lio/sentry/a7;->c:Lio/sentry/b7;

    .line 30
    .line 31
    iput-object p1, p0, Lio/sentry/b7;->f:Ljava/lang/String;

    .line 32
    .line 33
    return-void
.end method

.method public final p(Ljava/lang/String;)Lio/sentry/k1;
    .locals 6

    .line 1
    sget-object v4, Lio/sentry/r1;->SENTRY:Lio/sentry/r1;

    .line 2
    .line 3
    new-instance v5, Lio/sentry/e7;

    .line 4
    .line 5
    invoke-direct {v5}, Lio/sentry/e7;-><init>()V

    .line 6
    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    const/4 v3, 0x0

    .line 10
    move-object v0, p0

    .line 11
    move-object v1, p1

    .line 12
    invoke-virtual/range {v0 .. v5}, Lio/sentry/x6;->n(Ljava/lang/String;Ljava/lang/String;Lio/sentry/t4;Lio/sentry/r1;Lio/sentry/e7;)Lio/sentry/k1;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method

.method public final q()V
    .locals 7

    .line 1
    iget-object v0, p0, Lio/sentry/x6;->j:Lio/sentry/util/a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lio/sentry/util/a;->c()V

    .line 4
    .line 5
    .line 6
    :try_start_0
    iget-object v1, p0, Lio/sentry/x6;->i:Ljava/util/Timer;

    .line 7
    .line 8
    if-eqz v1, :cond_1

    .line 9
    .line 10
    iget-object v1, p0, Lio/sentry/x6;->r:Lio/sentry/k7;

    .line 11
    .line 12
    iget-object v1, v1, Lio/sentry/k7;->g:Ljava/lang/Long;

    .line 13
    .line 14
    if-eqz v1, :cond_1

    .line 15
    .line 16
    invoke-virtual {p0}, Lio/sentry/x6;->y()V

    .line 17
    .line 18
    .line 19
    iget-object v2, p0, Lio/sentry/x6;->l:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 20
    .line 21
    const/4 v3, 0x1

    .line 22
    invoke-virtual {v2, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 23
    .line 24
    .line 25
    new-instance v2, Lio/sentry/v6;

    .line 26
    .line 27
    const/4 v3, 0x0

    .line 28
    invoke-direct {v2, p0, v3}, Lio/sentry/v6;-><init>(Lio/sentry/x6;I)V

    .line 29
    .line 30
    .line 31
    iput-object v2, p0, Lio/sentry/x6;->g:Lio/sentry/v6;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 32
    .line 33
    :try_start_1
    iget-object v2, p0, Lio/sentry/x6;->i:Ljava/util/Timer;

    .line 34
    .line 35
    iget-object v4, p0, Lio/sentry/x6;->g:Lio/sentry/v6;

    .line 36
    .line 37
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 38
    .line 39
    .line 40
    move-result-wide v5

    .line 41
    invoke-virtual {v2, v4, v5, v6}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 42
    .line 43
    .line 44
    goto :goto_1

    .line 45
    :catchall_0
    move-exception v1

    .line 46
    :try_start_2
    iget-object v2, p0, Lio/sentry/x6;->d:Lio/sentry/g4;

    .line 47
    .line 48
    invoke-virtual {v2}, Lio/sentry/g4;->l()Lio/sentry/m6;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    invoke-virtual {v2}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    sget-object v4, Lio/sentry/m5;->WARNING:Lio/sentry/m5;

    .line 57
    .line 58
    const-string v5, "Failed to schedule finish timer"

    .line 59
    .line 60
    invoke-interface {v2, v4, v5, v1}, Lio/sentry/ILogger;->d(Lio/sentry/m5;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {p0}, Lio/sentry/x6;->getStatus()Lio/sentry/f7;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    if-eqz v1, :cond_0

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_0
    sget-object v1, Lio/sentry/f7;->OK:Lio/sentry/f7;

    .line 71
    .line 72
    :goto_0
    const/4 v2, 0x0

    .line 73
    invoke-virtual {p0, v1, v2}, Lio/sentry/x6;->v(Lio/sentry/f7;Lio/sentry/t4;)V

    .line 74
    .line 75
    .line 76
    iget-object p0, p0, Lio/sentry/x6;->l:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 77
    .line 78
    invoke-virtual {p0, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 79
    .line 80
    .line 81
    goto :goto_1

    .line 82
    :catchall_1
    move-exception p0

    .line 83
    goto :goto_2

    .line 84
    :cond_1
    :goto_1
    invoke-virtual {v0}, Lio/sentry/util/a;->close()V

    .line 85
    .line 86
    .line 87
    return-void

    .line 88
    :goto_2
    :try_start_3
    invoke-virtual {v0}, Lio/sentry/util/a;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 89
    .line 90
    .line 91
    goto :goto_3

    .line 92
    :catchall_2
    move-exception v0

    .line 93
    invoke-virtual {p0, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 94
    .line 95
    .line 96
    :goto_3
    throw p0
.end method

.method public final r(Ljava/lang/String;Ljava/lang/Long;Lio/sentry/j2;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lio/sentry/x6;->b:Lio/sentry/a7;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2, p3}, Lio/sentry/a7;->r(Ljava/lang/String;Ljava/lang/Long;Lio/sentry/j2;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final s()Lio/sentry/b7;
    .locals 0

    .line 1
    iget-object p0, p0, Lio/sentry/x6;->b:Lio/sentry/a7;

    .line 2
    .line 3
    iget-object p0, p0, Lio/sentry/a7;->c:Lio/sentry/b7;

    .line 4
    .line 5
    return-object p0
.end method

.method public final t()Lio/sentry/t4;
    .locals 0

    .line 1
    iget-object p0, p0, Lio/sentry/x6;->b:Lio/sentry/a7;

    .line 2
    .line 3
    iget-object p0, p0, Lio/sentry/a7;->b:Lio/sentry/t4;

    .line 4
    .line 5
    return-object p0
.end method

.method public final u(Ljava/lang/String;Ljava/lang/Number;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lio/sentry/x6;->b:Lio/sentry/a7;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lio/sentry/a7;->u(Ljava/lang/String;Ljava/lang/Number;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final v(Lio/sentry/f7;Lio/sentry/t4;)V
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    invoke-virtual {p0, p1, p2, v0, v1}, Lio/sentry/x6;->A(Lio/sentry/f7;Lio/sentry/t4;ZLio/sentry/i0;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final w()Lio/sentry/t4;
    .locals 0

    .line 1
    iget-object p0, p0, Lio/sentry/x6;->b:Lio/sentry/a7;

    .line 2
    .line 3
    iget-object p0, p0, Lio/sentry/a7;->a:Lio/sentry/t4;

    .line 4
    .line 5
    return-object p0
.end method

.method public final x()V
    .locals 3

    .line 1
    iget-object v0, p0, Lio/sentry/x6;->j:Lio/sentry/util/a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lio/sentry/util/a;->c()V

    .line 4
    .line 5
    .line 6
    :try_start_0
    iget-object v1, p0, Lio/sentry/x6;->h:Lio/sentry/v6;

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    iget-object v1, p0, Lio/sentry/x6;->h:Lio/sentry/v6;

    .line 11
    .line 12
    invoke-virtual {v1}, Ljava/util/TimerTask;->cancel()Z

    .line 13
    .line 14
    .line 15
    iget-object v1, p0, Lio/sentry/x6;->m:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    invoke-virtual {v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 19
    .line 20
    .line 21
    const/4 v1, 0x0

    .line 22
    iput-object v1, p0, Lio/sentry/x6;->h:Lio/sentry/v6;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :catchall_0
    move-exception p0

    .line 26
    goto :goto_1

    .line 27
    :cond_0
    :goto_0
    invoke-virtual {v0}, Lio/sentry/util/a;->close()V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :goto_1
    :try_start_1
    invoke-virtual {v0}, Lio/sentry/util/a;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 32
    .line 33
    .line 34
    goto :goto_2

    .line 35
    :catchall_1
    move-exception v0

    .line 36
    invoke-virtual {p0, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 37
    .line 38
    .line 39
    :goto_2
    throw p0
.end method

.method public final y()V
    .locals 3

    .line 1
    iget-object v0, p0, Lio/sentry/x6;->j:Lio/sentry/util/a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lio/sentry/util/a;->c()V

    .line 4
    .line 5
    .line 6
    :try_start_0
    iget-object v1, p0, Lio/sentry/x6;->g:Lio/sentry/v6;

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    iget-object v1, p0, Lio/sentry/x6;->g:Lio/sentry/v6;

    .line 11
    .line 12
    invoke-virtual {v1}, Ljava/util/TimerTask;->cancel()Z

    .line 13
    .line 14
    .line 15
    iget-object v1, p0, Lio/sentry/x6;->l:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    invoke-virtual {v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 19
    .line 20
    .line 21
    const/4 v1, 0x0

    .line 22
    iput-object v1, p0, Lio/sentry/x6;->g:Lio/sentry/v6;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :catchall_0
    move-exception p0

    .line 26
    goto :goto_1

    .line 27
    :cond_0
    :goto_0
    invoke-virtual {v0}, Lio/sentry/util/a;->close()V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :goto_1
    :try_start_1
    invoke-virtual {v0}, Lio/sentry/util/a;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 32
    .line 33
    .line 34
    goto :goto_2

    .line 35
    :catchall_1
    move-exception v0

    .line 36
    invoke-virtual {p0, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 37
    .line 38
    .line 39
    :goto_2
    throw p0
.end method

.method public final z(Lio/sentry/b7;Lio/sentry/e7;)Lio/sentry/k1;
    .locals 12

    .line 1
    iget-object v0, p0, Lio/sentry/x6;->b:Lio/sentry/a7;

    .line 2
    .line 3
    iget-boolean v0, v0, Lio/sentry/a7;->g:Z

    .line 4
    .line 5
    sget-object v1, Lio/sentry/d3;->a:Lio/sentry/d3;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    iget-object v0, p0, Lio/sentry/x6;->o:Lio/sentry/r1;

    .line 11
    .line 12
    iget-object v2, p1, Lio/sentry/b7;->W:Lio/sentry/r1;

    .line 13
    .line 14
    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-nez v0, :cond_1

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_1
    iget-object v0, p0, Lio/sentry/x6;->d:Lio/sentry/g4;

    .line 22
    .line 23
    invoke-virtual {v0}, Lio/sentry/g4;->l()Lio/sentry/m6;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-virtual {v2}, Lio/sentry/m6;->getIgnoredSpanOrigins()Ljava/util/List;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    iget-object v3, p2, Lio/sentry/e7;->d:Ljava/lang/String;

    .line 32
    .line 33
    invoke-static {v3, v2}, Lio/sentry/util/n;->a(Ljava/lang/String;Ljava/util/List;)Z

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    if-eqz v2, :cond_2

    .line 38
    .line 39
    :goto_0
    return-object v1

    .line 40
    :cond_2
    iget-object v2, p1, Lio/sentry/b7;->c:Lio/sentry/d7;

    .line 41
    .line 42
    iget-object v3, p1, Lio/sentry/b7;->e:Ljava/lang/String;

    .line 43
    .line 44
    iget-object v4, p1, Lio/sentry/b7;->f:Ljava/lang/String;

    .line 45
    .line 46
    iget-object v5, p0, Lio/sentry/x6;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 47
    .line 48
    invoke-virtual {v5}, Ljava/util/concurrent/CopyOnWriteArrayList;->size()I

    .line 49
    .line 50
    .line 51
    move-result v6

    .line 52
    invoke-virtual {v0}, Lio/sentry/g4;->l()Lio/sentry/m6;

    .line 53
    .line 54
    .line 55
    move-result-object v7

    .line 56
    invoke-virtual {v7}, Lio/sentry/m6;->getMaxSpans()I

    .line 57
    .line 58
    .line 59
    move-result v7

    .line 60
    if-ge v6, v7, :cond_4

    .line 61
    .line 62
    const-string v0, "parentSpanId is required"

    .line 63
    .line 64
    invoke-static {v2, v0}, Lio/sentry/util/c;->q(Ljava/lang/Object;Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    const-string v0, "operation is required"

    .line 68
    .line 69
    invoke-static {v3, v0}, Lio/sentry/util/c;->q(Ljava/lang/Object;Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {p0}, Lio/sentry/x6;->y()V

    .line 73
    .line 74
    .line 75
    new-instance v6, Lio/sentry/a7;

    .line 76
    .line 77
    new-instance v11, Lio/sentry/u6;

    .line 78
    .line 79
    invoke-direct {v11, p0}, Lio/sentry/u6;-><init>(Lio/sentry/x6;)V

    .line 80
    .line 81
    .line 82
    iget-object v8, p0, Lio/sentry/x6;->d:Lio/sentry/g4;

    .line 83
    .line 84
    move-object v7, p0

    .line 85
    move-object v9, p1

    .line 86
    move-object v10, p2

    .line 87
    invoke-direct/range {v6 .. v11}, Lio/sentry/a7;-><init>(Lio/sentry/x6;Lio/sentry/g4;Lio/sentry/b7;Lio/sentry/e7;Lio/sentry/u6;)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v7, v6}, Lio/sentry/x6;->D(Lio/sentry/a7;)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v5, v6}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    iget-object p0, v7, Lio/sentry/x6;->q:Lio/sentry/m;

    .line 97
    .line 98
    if-eqz p0, :cond_3

    .line 99
    .line 100
    invoke-interface {p0, v6}, Lio/sentry/m;->d(Lio/sentry/a7;)V

    .line 101
    .line 102
    .line 103
    :cond_3
    return-object v6

    .line 104
    :cond_4
    invoke-virtual {v0}, Lio/sentry/g4;->l()Lio/sentry/m6;

    .line 105
    .line 106
    .line 107
    move-result-object p0

    .line 108
    invoke-virtual {p0}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 109
    .line 110
    .line 111
    move-result-object p0

    .line 112
    sget-object p1, Lio/sentry/m5;->WARNING:Lio/sentry/m5;

    .line 113
    .line 114
    const-string p2, "Span operation: %s, description: %s dropped due to limit reached. Returning NoOpSpan."

    .line 115
    .line 116
    filled-new-array {v3, v4}, [Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    invoke-interface {p0, p1, p2, v0}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 121
    .line 122
    .line 123
    return-object v1
.end method

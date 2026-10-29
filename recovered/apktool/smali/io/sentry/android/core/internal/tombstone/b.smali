.class public final Lio/sentry/android/core/internal/tombstone/b;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public a:J

.field public b:J

.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;


# virtual methods
.method public a()Lio/sentry/protocol/DebugImage;
    .locals 6

    .line 1
    iget-wide v0, p0, Lio/sentry/android/core/internal/tombstone/b;->a:J

    .line 2
    .line 3
    iget-object v2, p0, Lio/sentry/android/core/internal/tombstone/b;->d:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v2, Ljava/lang/String;

    .line 6
    .line 7
    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    .line 8
    .line 9
    .line 10
    move-result v3

    .line 11
    if-eqz v3, :cond_0

    .line 12
    .line 13
    const/4 p0, 0x0

    .line 14
    return-object p0

    .line 15
    :cond_0
    new-instance v3, Lio/sentry/protocol/DebugImage;

    .line 16
    .line 17
    invoke-direct {v3}, Lio/sentry/protocol/DebugImage;-><init>()V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v3, v2}, Lio/sentry/protocol/DebugImage;->setCodeId(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    iget-object v4, p0, Lio/sentry/android/core/internal/tombstone/b;->c:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v4, Ljava/lang/String;

    .line 26
    .line 27
    invoke-virtual {v3, v4}, Lio/sentry/protocol/DebugImage;->setCodeFile(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    invoke-static {v2}, Lio/sentry/config/a;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v4

    .line 34
    if-eqz v4, :cond_1

    .line 35
    .line 36
    move-object v2, v4

    .line 37
    :cond_1
    invoke-virtual {v3, v2}, Lio/sentry/protocol/DebugImage;->setDebugId(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    const-string v4, "0x%x"

    .line 49
    .line 50
    invoke-static {v4, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    invoke-virtual {v3, v2}, Lio/sentry/protocol/DebugImage;->setImageAddr(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    iget-wide v4, p0, Lio/sentry/android/core/internal/tombstone/b;->b:J

    .line 58
    .line 59
    sub-long/2addr v4, v0

    .line 60
    invoke-virtual {v3, v4, v5}, Lio/sentry/protocol/DebugImage;->setImageSize(J)V

    .line 61
    .line 62
    .line 63
    const-string p0, "elf"

    .line 64
    .line 65
    invoke-virtual {v3, p0}, Lio/sentry/protocol/DebugImage;->setType(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    return-object v3
.end method

.method public b(JZZ)Z
    .locals 7

    .line 1
    iget-object v0, p0, Lio/sentry/android/core/internal/tombstone/b;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Llo3;

    .line 4
    .line 5
    invoke-virtual {v0}, Leg3;->y()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Lwg3;->A()V

    .line 9
    .line 10
    .line 11
    iget-object v0, v0, Lsq3;->a:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Lij3;

    .line 14
    .line 15
    invoke-virtual {v0}, Lij3;->d()Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    iget-object v2, v0, Lij3;->f:Luh3;

    .line 20
    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    iget-object v1, v0, Lij3;->e:Lki3;

    .line 24
    .line 25
    invoke-static {v1}, Lij3;->j(Lsq3;)V

    .line 26
    .line 27
    .line 28
    iget-object v1, v1, Lki3;->a0:Lio/sentry/android/core/s;

    .line 29
    .line 30
    iget-object v3, v0, Lij3;->V:Lxt0;

    .line 31
    .line 32
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 36
    .line 37
    .line 38
    move-result-wide v3

    .line 39
    invoke-virtual {v1, v3, v4}, Lio/sentry/android/core/s;->b(J)V

    .line 40
    .line 41
    .line 42
    :cond_0
    iget-wide v3, p0, Lio/sentry/android/core/internal/tombstone/b;->a:J

    .line 43
    .line 44
    sub-long v3, p1, v3

    .line 45
    .line 46
    if-nez p3, :cond_2

    .line 47
    .line 48
    const-wide/16 v5, 0x3e8

    .line 49
    .line 50
    cmp-long p3, v3, v5

    .line 51
    .line 52
    if-ltz p3, :cond_1

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_1
    invoke-static {v2}, Lij3;->l(Lhk3;)V

    .line 56
    .line 57
    .line 58
    iget-object p0, v2, Luh3;->Y:Lsh3;

    .line 59
    .line 60
    const-string p1, "Screen exposed for less than 1000 ms. Event not sent. time"

    .line 61
    .line 62
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 63
    .line 64
    .line 65
    move-result-object p2

    .line 66
    invoke-virtual {p0, p2, p1}, Lsh3;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    const/4 p0, 0x0

    .line 70
    return p0

    .line 71
    :cond_2
    :goto_0
    if-nez p4, :cond_3

    .line 72
    .line 73
    iget-wide v3, p0, Lio/sentry/android/core/internal/tombstone/b;->b:J

    .line 74
    .line 75
    sub-long v3, p1, v3

    .line 76
    .line 77
    iput-wide p1, p0, Lio/sentry/android/core/internal/tombstone/b;->b:J

    .line 78
    .line 79
    :cond_3
    invoke-static {v2}, Lij3;->l(Lhk3;)V

    .line 80
    .line 81
    .line 82
    iget-object p3, v2, Luh3;->Y:Lsh3;

    .line 83
    .line 84
    const-string v1, "Recording user engagement, ms"

    .line 85
    .line 86
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 87
    .line 88
    .line 89
    move-result-object v2

    .line 90
    invoke-virtual {p3, v2, v1}, Lsh3;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    new-instance p3, Landroid/os/Bundle;

    .line 94
    .line 95
    invoke-direct {p3}, Landroid/os/Bundle;-><init>()V

    .line 96
    .line 97
    .line 98
    const-string v1, "_et"

    .line 99
    .line 100
    invoke-virtual {p3, v1, v3, v4}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 101
    .line 102
    .line 103
    iget-object v1, v0, Lij3;->d:Lpd3;

    .line 104
    .line 105
    invoke-virtual {v1}, Lpd3;->N()Z

    .line 106
    .line 107
    .line 108
    move-result v1

    .line 109
    const/4 v2, 0x1

    .line 110
    xor-int/2addr v1, v2

    .line 111
    iget-object v3, v0, Lij3;->W:Llm3;

    .line 112
    .line 113
    invoke-static {v3}, Lij3;->k(Lwg3;)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {v3, v1}, Llm3;->F(Z)Lbm3;

    .line 117
    .line 118
    .line 119
    move-result-object v1

    .line 120
    invoke-static {v1, p3, v2}, Lup3;->q0(Lbm3;Landroid/os/Bundle;Z)V

    .line 121
    .line 122
    .line 123
    if-nez p4, :cond_4

    .line 124
    .line 125
    iget-object p4, v0, Lij3;->X:Lsl3;

    .line 126
    .line 127
    invoke-static {p4}, Lij3;->k(Lwg3;)V

    .line 128
    .line 129
    .line 130
    const-string v0, "auto"

    .line 131
    .line 132
    const-string v1, "_e"

    .line 133
    .line 134
    invoke-virtual {p4, v0, v1, p3}, Lsl3;->G(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    .line 135
    .line 136
    .line 137
    :cond_4
    iput-wide p1, p0, Lio/sentry/android/core/internal/tombstone/b;->a:J

    .line 138
    .line 139
    iget-object p0, p0, Lio/sentry/android/core/internal/tombstone/b;->c:Ljava/lang/Object;

    .line 140
    .line 141
    check-cast p0, Ldo3;

    .line 142
    .line 143
    invoke-virtual {p0}, Lbe3;->c()V

    .line 144
    .line 145
    .line 146
    sget-object p1, Lvg3;->q0:Lug3;

    .line 147
    .line 148
    const/4 p2, 0x0

    .line 149
    invoke-virtual {p1, p2}, Lug3;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object p1

    .line 153
    check-cast p1, Ljava/lang/Long;

    .line 154
    .line 155
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 156
    .line 157
    .line 158
    move-result-wide p1

    .line 159
    invoke-virtual {p0, p1, p2}, Lbe3;->b(J)V

    .line 160
    .line 161
    .line 162
    return v2
.end method
